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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKProfile/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBSDKProfilePtr extends Ptr<FBSDKProfile, FBSDKProfilePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKProfile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKProfile() {}
    protected FBSDKProfile(Handle h, long handle) { super(h, handle); }
    protected FBSDKProfile(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserID:firstName:middleName:lastName:name:linkURL:refreshDate:")
    public FBSDKProfile(String userID, String firstName, String middleName, String lastName, String name, NSURL linkURL, NSDate refreshDate) { super((SkipInit) null); initObject(init(userID, firstName, middleName, lastName, name, linkURL, refreshDate)); }
    @Method(selector = "initWithUserID:firstName:middleName:lastName:name:linkURL:refreshDate:imageURL:email:")
    public FBSDKProfile(String userID, String firstName, String middleName, String lastName, String name, NSURL linkURL, NSDate refreshDate, NSURL imageURL, String email) { super((SkipInit) null); initObject(init(userID, firstName, middleName, lastName, name, linkURL, refreshDate, imageURL, email)); }
    @Method(selector = "initWithCoder:")
    public FBSDKProfile(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentProfile")
    public static native FBSDKProfile getCurrentProfile();
    @Property(selector = "setCurrentProfile:")
    public static native void setCurrentProfile(FBSDKProfile v);
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "firstName")
    public native String getFirstName();
    @Property(selector = "middleName")
    public native String getMiddleName();
    @Property(selector = "lastName")
    public native String getLastName();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "linkURL")
    public native NSURL getLinkURL();
    @Property(selector = "refreshDate")
    public native NSDate getRefreshDate();
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKProfileDidChangeNotification", optional=true)
    public static native NSString didChangeNotification();
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }

        @GlobalValue(symbol="FBSDKProfileChangeOldKey", optional=true)
        public static native NSString ChangeOld();
        @GlobalValue(symbol="FBSDKProfileChangeNewKey", optional=true)
        public static native NSString ChangeNew();
    }
    
    @Method(selector = "initWithUserID:firstName:middleName:lastName:name:linkURL:refreshDate:")
    protected native @Pointer long init(String userID, String firstName, String middleName, String lastName, String name, NSURL linkURL, NSDate refreshDate);
    @Method(selector = "initWithUserID:firstName:middleName:lastName:name:linkURL:refreshDate:imageURL:email:")
    protected native @Pointer long init(String userID, String firstName, String middleName, String lastName, String name, NSURL linkURL, NSDate refreshDate, NSURL imageURL, String email);
    @Method(selector = "imageURLForPictureMode:size:")
    public native NSURL getImageURL(FBSDKProfilePictureMode mode, @ByVal CGSize size);
    @Method(selector = "isEqualToProfile:")
    public native boolean isEqualToProfile(FBSDKProfile profile);
    @Method(selector = "enableUpdatesOnAccessTokenChange:")
    public static native void enableUpdatesOnAccessTokenChange(boolean enable);
    @Method(selector = "loadCurrentProfileWithCompletion:")
    public static native void loadCurrentProfile(@Block VoidBlock2<FBSDKProfile, NSError> completion);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
