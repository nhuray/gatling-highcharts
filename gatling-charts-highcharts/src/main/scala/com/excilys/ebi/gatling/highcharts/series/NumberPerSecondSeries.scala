/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.series

import scala.collection.mutable.ArrayBuffer

import com.excilys.ebi.gatling.charts.series.Series

class NumberPerSecondSeries(name: String, data: List[(Long, Int)], color: String) extends Series[Long, Int](name, data, List(color)) {

	def getElements: ArrayBuffer[String] = {
		val buffer = new ArrayBuffer[String]
		buffer += "name: '" + name + "',"
		buffer += "color: '" + color + "',"
		buffer += "data: ["
		if (!sample.isEmpty) {
			buffer ++= sample.map {
				entry => new StringBuilder().append("[").append(entry._1).append(",").append(entry._2).append("]").toString
			}.foldLeft(List[String]())((l, v) => "," :: v :: l).tail.reverse
		}
		buffer += "], tooltip: { yDecimals: 0, ySuffix: '' }"
	}
}