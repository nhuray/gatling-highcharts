/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.template

import com.excilys.ebi.gatling.charts.template.PageTemplate
import com.excilys.ebi.gatling.core.util.PathHelper.path2string
import com.excilys.ebi.gatling.highcharts.config.HighchartsFiles.{TRANSACTIONS_JS_TEMPLATE_URL, TRANSACTIONS_HTML_TEMPLATE_URL}
import com.excilys.ebi.gatling.highcharts.series.{PieSeries, NumberPerSecondSeries}

class TransactionsTemplate(chartTitle: String, series: Seq[NumberPerSecondSeries], pieSeries: PieSeries, activeSessionsSeries: NumberPerSecondSeries) extends Template {

	def getJSContent = PageTemplate.TEMPLATE_ENGINE.layout(TRANSACTIONS_JS_TEMPLATE_URL, Map("yAxisTitle" -> "Number of Transactions /s",
		"chartTitle" -> chartTitle,
		"series" -> series,
		"pieSeries" -> pieSeries,
		"activeSessions" -> activeSessionsSeries))

	def getHTMLContent = PageTemplate.TEMPLATE_ENGINE.layout(TRANSACTIONS_HTML_TEMPLATE_URL)
}