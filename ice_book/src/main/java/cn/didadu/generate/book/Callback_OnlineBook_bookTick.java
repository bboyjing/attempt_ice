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
// Generated from file `Service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.didadu.generate.book;

public abstract class Callback_OnlineBook_bookTick
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<cn.didadu.generate.book.Message>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        OnlineBookPrxHelper.__bookTick_completed(this, __result);
    }
}
