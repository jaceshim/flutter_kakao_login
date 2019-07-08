package com.josephnk.flutterkakaologin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * FlutterKakaoLoginPlugin
 */
public class FlutterKakaoLoginPlugin implements MethodCallHandler, PluginRegistry.ActivityResultListener {

  private static final String CHANNEL_NAME = "flutter_kakao_login";

  private static final String METHOD_LOG_IN = "logIn";
  private static final String METHOD_LOG_OUT = "logOut";
  private static final String METHOD_GET_CURRENT_ACCESS_TOKEN = "getCurrentAccessToken";
  private static final String METHOD_GET_USER_ME = "getUserMe";

  private static final String LOG_TAG = "KakaoTalkPlugin";

  private Activity currentActivity;
  private SessionCallback sessionCallback;

  /**
   * Plugin registration.
   */
  public static void registerWith(Registrar registrar) {
    final FlutterKakaoLoginPlugin plugin = new FlutterKakaoLoginPlugin(registrar);
    final MethodChannel channel = new MethodChannel(registrar.messenger(), CHANNEL_NAME);
    channel.setMethodCallHandler(plugin);
    registrar.addActivityResultListener(plugin);
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    final Result _result = result;
  }
}
