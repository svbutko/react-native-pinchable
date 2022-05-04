//
//  RNPinchableView.h
//  RNPinchable
//
//  Created by Joel Arvidsson on 2019-01-06.
//  Copyright © 2019 Joel Arvidsson. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <React/RCTView.h>

NS_ASSUME_NONNULL_BEGIN

@interface RNPinchableView : RCTView<UIGestureRecognizerDelegate>

@property (nonatomic) CGFloat minimumZoomScale;
@property (nonatomic) CGFloat maximumZoomScale;
@property (nonatomic) RCTBubblingEventBlock onGestureBegan;
@property (nonatomic) RCTBubblingEventBlock onGestureEnded;

@end

NS_ASSUME_NONNULL_END
