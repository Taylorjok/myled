/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_yeker_myled_JniLib */

#ifndef _Included_com_yeker_myled_JniLib
#define _Included_com_yeker_myled_JniLib

/*
 * Class:     com_yeker_myled_JniLib
 * Method:    led_open
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_yeker_myled_JniLib_led_1open
  (JNIEnv *, jobject);

/*
 * Class:     com_yeker_myled_JniLib
 * Method:    led_close
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_yeker_myled_JniLib_led_1close
  (JNIEnv *, jobject);

/*
 * Class:     com_yeker_myled_JniLib
 * Method:    ledIoctl
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_yeker_myled_JniLib_ledIoctl
  (JNIEnv *, jobject, jint);


#endif
