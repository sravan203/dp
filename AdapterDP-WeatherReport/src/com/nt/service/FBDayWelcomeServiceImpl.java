package com.nt.service;

import com.nt.adapter.WeatherDetailsAdapter;
import com.nt.external.WeatherReportComp;
import com.nt.external.WeatherReportCompImpl;

public class FBDayWelcomeServiceImpl implements FBDayWelcomeService {

	@Override
	public float getTemparature(String cityName, String countryName) throws IllegalArgumentException {
		 float temp=0.0f;
		 WeatherDetailsAdapter adapter=null;
		 //get Adapter class
		 adapter=WeatherDetailsAdapter.getAdapter();
		 //invoke B.method
		 temp=adapter.getTemparatureAdapter(cityName, countryName);
		return temp;
	}

}
