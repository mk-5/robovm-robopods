/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.onesignal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSDeviceState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSDeviceStatePtr extends Ptr<OSDeviceState, OSDeviceStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSDeviceState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSDeviceState() {}
    protected OSDeviceState(Handle h, long handle) { super(h, handle); }
    protected OSDeviceState(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hasNotificationPermission")
    public native boolean hasNotificationPermission();
    @Property(selector = "isPushDisabled")
    public native boolean isPushDisabled();
    @Property(selector = "isSubscribed")
    public native boolean isSubscribed();
    @Property(selector = "notificationPermissionStatus")
    public native OSNotificationPermission getNotificationPermissionStatus();
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "pushToken")
    public native String getPushToken();
    @Property(selector = "emailUserId")
    public native String getEmailUserId();
    @Property(selector = "emailAddress")
    public native String getEmailAddress();
    @Property(selector = "isEmailSubscribed")
    public native boolean isEmailSubscribed();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "jsonRepresentation")
    public native NSDictionary<?, ?> jsonRepresentation();
    /*</methods>*/
}
