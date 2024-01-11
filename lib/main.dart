import 'package:flutter/material.dart';
import 'package:yhomap/presentation/map_screen.dart';
import 'package:yandex_mapkit/yandex_mapkit.dart';

void main() {
  AndroidYandexMap.useAndroidViewSurface = false;
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: 'Yandex Mapkit Demo',
      home: MapScreen(),
    );
  }
}