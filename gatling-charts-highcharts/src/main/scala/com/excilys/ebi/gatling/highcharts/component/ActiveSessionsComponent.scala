/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.component

import com.excilys.ebi.gatling.charts.series.Series
import com.excilys.ebi.gatling.highcharts.series.NumberPerSecondSeries
import com.excilys.ebi.gatling.highcharts.template.ActiveSessionsTemplate

class ActiveSessionsComponent(series: Series[Long, Int]*)
	extends HighchartsComponent(new ActiveSessionsTemplate("Active Sessions along the simulation", series.map { s => new NumberPerSecondSeries(s.name, s.data, s.colors.head) }))