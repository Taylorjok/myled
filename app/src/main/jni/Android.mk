LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := MyLed
LOCAL_SRC_FILES =: MyLed.cpp
include $(BUILD_SHARED_LIBRARY)