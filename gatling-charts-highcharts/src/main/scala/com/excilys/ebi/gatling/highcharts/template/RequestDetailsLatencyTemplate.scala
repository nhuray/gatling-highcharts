/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.template
import com.excilys.ebi.gatling.charts.template.PageTemplate
import com.excilys.ebi.gatling.core.util.PathHelper.path2string
import com.excilys.ebi.gatling.highcharts.config.HighchartsFiles.{ REQUEST_DETAILS_LATENCY_JS_TEMPLATE_URL, REQUEST_DETAILS_LATENCY_HTML_TEMPLATE_URL }
import com.excilys.ebi.gatling.highcharts.series.{ ResponseTimeSeries, NumberPerSecondSeries }

class RequestDetailsLatencyTemplate(chartTitle: String, successSeries: ResponseTimeSeries, failuresSeries: ResponseTimeSeries, activeSessionSeries: NumberPerSecondSeries) extends Template {

	def getJSContent = PageTemplate.TEMPLATE_ENGINE.layout(REQUEST_DETAILS_LATENCY_JS_TEMPLATE_URL, Map("chartTitle" -> chartTitle,
		"successSeries" -> successSeries,
		"failureSeries" -> failuresSeries,
		"activeSessionsSeries" -> activeSessionSeries))

	def getHTMLContent = PageTemplate.TEMPLATE_ENGINE.layout(REQUEST_DETAILS_LATENCY_HTML_TEMPLATE_URL)
}

