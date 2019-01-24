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
package org.robovm.pods.helpshift;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HelpshiftSupport/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements HsApiProvider/*</implements>*/ {

    /*<ptr>*/public static class HelpshiftSupportPtr extends Ptr<HelpshiftSupport, HelpshiftSupportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HelpshiftSupport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HelpshiftSupport() {}
    protected HelpshiftSupport(Handle h, long handle) { super(h, handle); }
    protected HelpshiftSupport(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HelpshiftSupportDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(HelpshiftSupportDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="HelpshiftSupportCustomMetadataKey", optional=true)
    public static native String getHelpshiftSupportCustomMetadata();
    @GlobalValue(symbol="HelpshiftSupportTagsKey", optional=true)
    public static native String getHelpshiftSupportTagsKey();
    
    @Method(selector = "dynamicFormWithTitle:andFlows:")
    public native UIViewController getDynamicForm(String title, NSArray<?> flows);
    @Method(selector = "sharedInstance")
    public static native HelpshiftSupport sharedInstance();
    @Method(selector = "pauseDisplayOfInAppNotification:")
    public static native void pauseDisplayOfInAppNotification(boolean pauseInApp);
    @Method(selector = "setLanguage:")
    public static native void setLanguage(String languageCode);
    @Method(selector = "showConversation:withOptions:")
    public static native void showConversation(UIViewController viewController, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "showConversation:withConfig:")
    public static native void showConversation(UIViewController viewController, HelpshiftAPIConfig configObject);
    @Method(selector = "showFAQs:withOptions:")
    public static native void showFAQs(UIViewController viewController, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "showFAQs:withConfig:")
    public static native void showFAQs(UIViewController viewController, HelpshiftAPIConfig configObject);
    @Method(selector = "showFAQSection:withController:withOptions:")
    public static native void showFAQSection(String faqSectionPublishID, UIViewController viewController, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "showFAQSection:withController:withConfig:")
    public static native void showFAQSection(String faqSectionPublishID, UIViewController viewController, HelpshiftAPIConfig configObject);
    @Method(selector = "showSingleFAQ:withController:withOptions:")
    public static native void showSingleFAQ(String faqPublishID, UIViewController viewController, NSDictionary<?, ?> optionsDictionary);
    @Method(selector = "showSingleFAQ:withController:withConfig:")
    public static native void showSingleFAQ(String faqPublishID, UIViewController viewController, HelpshiftAPIConfig configObject);
    @Method(selector = "showAlertToRateAppWithURL:withCompletionBlock:")
    public static native void showAlertToRateApp(String url, @Block VoidBlock1<HelpshiftSupportAlertToRateAppAction> completionBlock);
    @Method(selector = "setUserIdentifier:")
    public static native void setUserIdentifier(String userIdentifier);
    @Method(selector = "leaveBreadCrumb:")
    public static native void leaveBreadCrumb(String breadCrumbString);
    @Method(selector = "setMetadataBlock:")
    public static native void setMetadataBlock(@Block Block0<NSDictionary<?, ?>> metadataBlock);
    @Method(selector = "setMetadataObjectBlock:")
    public static native void setMetadataObjectBlock(@Block Block0<HelpshiftSupportMetaData> metadataBlock);
    @Method(selector = "isConversationActive")
    public static native boolean isConversationActive();
    @Method(selector = "checkIfConversationActive")
    public static native void checkIfConversationActive();
    @Method(selector = "getNotificationCountFromRemote:")
    public static native @MachineSizedSInt long getNotificationCountFromRemote(boolean isRemote);
    @Method(selector = "requestUnreadMessagesCount:")
    public static native void requestUnreadMessagesCount(boolean isRemote);
    @Method(selector = "clearBreadCrumbs")
    public static native void clearBreadCrumbs();
    @Method(selector = "closeHelpshiftSupportSession")
    public static native void closeHelpshiftSupportSession();
    @Method(selector = "handleContinueUserActivity:withController:andRestorationHandler:")
    public static native boolean handleContinueUserActivity(NSUserActivity userActivity, UIViewController viewController, @Block VoidBlock1<NSArray<?>> restorationHandler);
    @Method(selector = "addLog:")
    public static native void addLog(String message);
    @Method(selector = "showDynamicFormOnViewController:withTitle:andFlows:withConfigOptions:")
    public static native boolean showDynamicForm(UIViewController viewController, String title, NSArray<?> flows, NSDictionary<?, ?> configOptions);
    @Method(selector = "showDynamicFormOnViewController:withTitle:andFlows:withConfig:")
    public static native boolean showDynamicForm(UIViewController viewController, String title, NSArray<?> flows, HelpshiftAPIConfig configObject);
    @Method(selector = "showDynamicFormOnViewController:withTitle:andFlowsData:withConfigOptions:")
    public static native boolean showDynamicFormWithFlowsData(UIViewController viewController, String title, NSArray<?> flows, NSDictionary<?, ?> configOptions);
    @Method(selector = "pushDynamicFormOnViewController:withTitle:andFlows:")
    public static native boolean pushDynamicForm(UIViewController viewController, String title, NSArray<?> flows);
    @Method(selector = "dynamicFormWithTitle:andFlows:")
    public static native UINavigationController createDynamicForm(String title, NSArray<?> flows);
    @Method(selector = "requestDynamicFormWithTitle:andFlows:")
    public static native void requestDynamicFormWithTitle$andFlows$(String title, NSArray<?> flows);
    @Method(selector = "flowToShowConversationWithDisplayText:andConfigOptions:")
    public static native NSObject createDlowToShowConversation(String displayText, NSDictionary<?, ?> configOptions);
    @Method(selector = "flowToShowConversationWithDisplayText:andConfig:")
    public static native NSObject createFlowToShowConversation(String displayText, HelpshiftAPIConfig configObject);
    @Method(selector = "flowToShowFAQsWithDisplayText:andConfigOptions:")
    public static native NSObject createFlowToShowFAQs(String displayText, NSDictionary<?, ?> configOptions);
    @Method(selector = "flowToShowFAQsWithDisplayText:andConfig:")
    public static native NSObject createFlowToShowFAQs(String displayText, HelpshiftAPIConfig configObject);
    @Method(selector = "flowToShowFAQSectionForPublishId:withDisplayText:andConfigOptions:")
    public static native NSObject createFlowToShowFAQSection(String sectionPublishId, String displayText, NSDictionary<?, ?> configOptions);
    @Method(selector = "flowToShowFAQSectionForPublishId:withDisplayText:andConfig:")
    public static native NSObject createFlowToShowFAQSection(String sectionPublishId, String displayText, HelpshiftAPIConfig configObject);
    @Method(selector = "flowToShowSingleFAQForPublishId:withDisplayText:andConfigOptions:")
    public static native NSObject createFlowToShowSingleFAQForPublishId(String FAQPublishId, String displayText, NSDictionary<?, ?> configOptions);
    @Method(selector = "flowToShowSingleFAQForPublishId:withDisplayText:andConfig:")
    public static native NSObject createFlowToShowSingleFAQForPublishId(String FAQPublishId, String displayText, HelpshiftAPIConfig configObject);
    @Method(selector = "flowToShowNestedDynamicFormWithFlows:withDisplayText:")
    public static native NSObject createFlowToShowNestedDynamicForm(NSArray<?> nextDynamicFormFlows, String displayText);
    @Method(selector = "flowToPerformCustomActionOnTarget:andSelector:withOptionalObject:withDisplayText:")
    public static native NSObject createFlowToPerformCustomAction(NSObject target, Selector selector, NSObject optionalObject, String displayText);
    @Method(selector = "conversationViewControllerWithConfig:completion:")
    public static native void getConversationViewController(HelpshiftAPIConfig config, @Block VoidBlock1<UIViewController> completion);
    @Method(selector = "_installForApiKey:domainName:appID:")
    public native void installForApiKey(String apiKey, String domainName, String appID);
    @Method(selector = "_installForApiKey:domainName:appID:withConfig:")
    public native void installForApiKey(String apiKey, String domainName, String appID, HelpshiftInstallConfig configObject);
    @Method(selector = "_login:")
    public native boolean login(HelpshiftUser user);
    @Method(selector = "_logout")
    public native boolean logout();
    @Method(selector = "_clearAnonymousUser")
    public native boolean clearAnonymousUser();
    @Method(selector = "_setName:andEmail:")
    public native void setNameAndEmail(String name, String email);
    @Method(selector = "_registerDeviceToken:")
    public native void registerDeviceToken(NSData deviceToken);
    @Method(selector = "_handleRemoteNotification:withController:")
    public native boolean handleRemoteNotification(NSDictionary<?, ?> notification, UIViewController viewController);
    @Method(selector = "_handleRemoteNotification:isAppLaunch:withController:")
    public native boolean handleRemoteNotification(NSDictionary<?, ?> notification, boolean isAppLaunch, UIViewController viewController);
    @Method(selector = "_handleLocalNotificationWithUserInfoDictionary:withController:")
    public native boolean handleLocalNotification(NSDictionary<?, ?> userInfo, UIViewController viewController);
    @Method(selector = "_handleInteractiveRemoteNotification:forAction:completionHandler:")
    public native void handleInteractiveRemoteNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    @Method(selector = "_handleInteractiveLocalNotification:forAction:completionHandler:")
    public native void handleInteractiveLocalNotification(NSDictionary<?, ?> notification, String actionIdentifier, @Block Runnable completionHandler);
    @Method(selector = "_handleEventsForBackgroundURLSession:completionHandler:")
    public native void handleEventsForBackgroundURLSession(String identifier, @Block Runnable completionHandler);
    @Method(selector = "_setSDKLanguage:")
    public native boolean setSDKLanguage(String langCode);
    /*</methods>*/
}
