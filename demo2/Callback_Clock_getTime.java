// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `interface.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package demo2;

public abstract class Callback_Clock_getTime
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<demo2.TimeOfDay>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        ClockPrxHelper.__getTime_completed(this, __result);
    }
}
