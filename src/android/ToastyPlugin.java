package org.apache.cordova.plugin;

import android.widget.Toast;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ToastyPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("show")) {
            String message = args.getString(0);
            String duration = args.getString(1);
            this.show(message, duration);
            callbackContext.success();
            return true;
        }
        return false;
    }

    private void show(String message, String duration) {
        int toastDuration = "long".equals(duration) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;
        Toast.makeText(cordova.getActivity(), message, toastDuration).show();
    }
}
