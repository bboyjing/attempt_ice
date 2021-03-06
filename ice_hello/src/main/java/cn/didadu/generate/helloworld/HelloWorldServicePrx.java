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
// Generated from file `HelloWorld.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.didadu.generate.helloworld;

public interface HelloWorldServicePrx extends Ice.ObjectPrx
{
    public String hello();

    public String hello(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hello();

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hello(Ice.Callback __cb);

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_hello(Callback_HelloWorldService_hello __cb);

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx, Callback_HelloWorldService_hello __cb);

    public Ice.AsyncResult begin_hello(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_hello(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb);

    public String end_hello(Ice.AsyncResult __result);
}
