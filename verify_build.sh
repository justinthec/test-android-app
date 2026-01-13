#!/bin/bash
set -e

# Define environment variables (must match setup_sdk.sh locations)
export ANDROID_HOME="$HOME/android-sdk"
export PATH="$HOME/android-sdk/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/emulator:$PATH"

echo "Checking for Android SDK..."
if [ ! -d "$ANDROID_HOME" ]; then
    echo "Error: ANDROID_HOME ($ANDROID_HOME) not found. Please run setup_sdk.sh first."
    exit 1
fi

echo "Verifying Build (assembleDebug)..."
./gradlew assembleDebug

echo "Verifying Unit Tests (testDebugUnitTest)..."
./gradlew testDebugUnitTest

echo "✅ Verification Successful: App builds and tests pass."
