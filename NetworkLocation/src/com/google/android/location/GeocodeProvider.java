package com.google.android.location;

import java.util.List;

import android.content.Context;
import android.location.Address;
import android.location.GeocoderParams;
import android.util.Log;

public class GeocodeProvider extends
		com.android.location.provider.GeocodeProvider {
	private static final String TAG = GeocodeProvider.class.getName();

	public GeocodeProvider(Context context) {
		Log.d(TAG, "new Provider-Object constructed");
	}

	@Override
	public String onGetFromLocation(double arg0, double arg1, int arg2,
			GeocoderParams arg3, List<Address> arg4) {
		Log.w(TAG,
				"GeocodeProvider not yet implemented. The application may not work.");
		return null;
	}

	@Override
	public String onGetFromLocationName(String arg0, double arg1, double arg2,
			double arg3, double arg4, int arg5, GeocoderParams arg6,
			List<Address> arg7) {
		Log.w(TAG,
				"GeocodeProvider not yet implemented. The application may not work.");
		return null;
	}

}
