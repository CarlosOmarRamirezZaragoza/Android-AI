# 1. Protect the generated clases API Key and configuration
-keep class com.ml.dogedex.core.BuildConfig { *; }

# 2. Avoid R8 brake TensorFlow Lite
-keep class org.tensorflow.lite.** { *; }
-keep class com.google.mlkit.** { *; }

# 3. Protect the data models (Dogs)
-keep class com.ml.dogedex.core.model.** { *; }

# 4. Keep Hilt/Dagger anotations
-keepattributes *Annotation*
-keepattributes Signature
