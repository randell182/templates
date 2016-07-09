# Template script to be used for basic data mining with Spark

from pyspark import SparkContext
from pyspark import SparkConf
from pyspark.sql import HiveContext
from pyspark.sql import SQLContext
from pyspark.sql import Row
from pyspark.sql.types import *

APP_NAME="TEMPLATE"
local_file_uri = "local://"
INPUT_FILE="in.txt" # Must be copied to HDFS
OUTPUT_FILE="out.txt"

def latestPartition(table, hc):
    return hc.sql("show partitions " + table).collect()[-1].result


def readFromCSVFile(sc, filename):
    blLines = sc.textFile(filename)
    return map(lambda l: map( lambda f: f.strip(), l.split('\t')), blLines.collect())


def readFromHive(hc,tableName):
    ds = latestPartition("{tableName}".format(tableName=tableName),hc)
    return hc.sql("select * {tableName}  where {ds}  group by primary_heading_code, is_paid  ".format(tableName=tableName,ds=ds)) \
        .map(lambda row: dict(row.asDict()))

def main(sc,ssc,hc):

    in_file = readFromCSVFile(sc,INPUT_FILE)
    table = readFromHive(hc,"table")

    agg = sc.createDataFrame(in_file.union(table)).groupBy("col1").agg({"total":"sum"}) # Example of joining and aggregation
    agg.show()

    agg.repartition(1).save(source="com.databricks.spark.csv", header="true", delimiter='\t', mode="overwrite", path=OUTPUT_FILE)


    pass


if __name__ == "__main__":
    conf = SparkConf()
    conf.setAppName(APP_NAME)
    sc = SparkContext(conf = conf)
    hc =  HiveContext(sc)
    ssc = SQLContext(sc)
    main(sc,hc,ssc)

