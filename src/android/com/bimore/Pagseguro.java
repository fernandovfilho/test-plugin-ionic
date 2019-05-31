package com.bimore.pagseguro;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PagseguroPlugin extends CordovaPlugin {

    private static final String TAG = "PagseguroPlugin";

    public void initialize(CordovaInterface cordova, CordovaView webView) {

        super.initialize(cordova, webView);

        Log.d(TAG, "Initialize PagseguroPlugin");

    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {


        if(action.equals("echo")) {
            String phrase = args.getString(0);
            Log.d(TAG, phrase);
        }

        return true;

    }

}