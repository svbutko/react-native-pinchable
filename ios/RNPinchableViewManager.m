//
//  RNPinchableViewManager.m
//  RNPinchable
//
//  Created by Joel Arvidsson on 2019-01-06.
//  Copyright © 2019 Joel Arvidsson. All rights reserved.
//

#import "RNPinchableViewManager.h"
#import "RNPinchableView.h"

@implementation RNPinchableViewManager

RCT_EXPORT_MODULE(PinchableView)

- (RNPinchableView *)view
{
  return [RNPinchableView new];
}

RCT_EXPORT_VIEW_PROPERTY(minimumZoomScale, CGFloat);
RCT_EXPORT_VIEW_PROPERTY(maximumZoomScale, CGFloat);
RCT_EXPORT_VIEW_PROPERTY(onGestureBegan, RCTBubblingEventBlock);
RCT_EXPORT_VIEW_PROPERTY(onGestureEnded, RCTBubblingEventBlock);

@end
