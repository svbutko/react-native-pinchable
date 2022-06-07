package com.oblador.pinchable;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Map;

import javax.annotation.Nonnull;

public class PinchableViewManager extends ViewGroupManager<PinchableView> {
    private static final String REACT_CLASS = "PinchableView";
    private static final float defaultMinimumZoomScale = 1.0f;
    private static final float defaultMaximumZoomScale = 3.0f;
    private static final String PROP_ON_GESTURE_BEGAN = "onGestureBegan";
    private static final String PROP_ON_GESTURE_ENDED = "onGestureEnded";

    ReactApplicationContext mCallerContext;

    public PinchableViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public @Nonnull PinchableView createViewInstance(@Nonnull ThemedReactContext ctx) {
        return new PinchableView(ctx);
    }

    @ReactProp(name = "minimumZoomScale", defaultFloat = defaultMinimumZoomScale)
    public void setMinimumZoomScale(PinchableView view, float minimumZoomScale) {
        view.setMinimumZoomScale(minimumZoomScale);
    }

    @ReactProp(name = "maximumZoomScale", defaultFloat = defaultMaximumZoomScale)
    public void setMaximumZoomScale(PinchableView view, float maximumZoomScale) {
        view.setMaximumZoomScale(maximumZoomScale);
    }

    @Override
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.<String, Object>builder()
                .put(PROP_ON_GESTURE_BEGAN, MapBuilder.of("registrationName", PROP_ON_GESTURE_BEGAN))
                .put(PROP_ON_GESTURE_ENDED, MapBuilder.of("registrationName", PROP_ON_GESTURE_ENDED))
                .build();
    }
}
