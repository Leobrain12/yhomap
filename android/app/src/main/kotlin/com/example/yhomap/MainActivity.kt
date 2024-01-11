package com.example.yhomap

import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant
import com.yandex.mapkit.MapKitFactory

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        MapKitFactory.setLocale("YOUR_LOCALE") // Your preferred language. Not required, defaults to system language
        MapKitFactory.setApiKey("b505015c-8c0a-4a4f-93be-3ca6a6d57ee2") // Your generated API key
        super.configureFlutterEngine(flutterEngine)
    }
}
