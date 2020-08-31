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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/BNCErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InitError(1000L),
    DuplicateResourceError(1001L),
    RedeemCreditsError(1002L),
    BadRequestError(1003L),
    ServerProblemError(1004L),
    NilLogError(1005L),
    VersionError(1006L),
    NetworkServiceInterfaceError(1007L),
    InvalidNetworkPublicKeyError(1008L),
    ContentIdentifierError(1009L),
    SpotlightNotAvailableError(1010L),
    SpotlightTitleError(1011L),
    RedeemZeroCreditsError(1012L),
    SpotlightIdentifierError(1013L),
    SpotlightPublicIndexError(1014L),
    TrackingDisabledError(1015L),
    GeneralError(1016L),
    HighestError(1017L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/BNCErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/BNCErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/BNCErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/BNCErrorCode/*</name>*/.class.getName());
    }

    // dkimitsa: manually added code as  getClassDomain is moved to NSError extension
    public static String getClassDomain() {
        return NSErrorExtensions.getClassDomain();
    }

    // bind wrap to include it in compilation as long as nserror enum is used
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/BNCErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/BNCErrorCode/*</name>*/.getClassDomain();
        }
    }
}
