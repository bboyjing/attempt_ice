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

/**
 * Provides type-specific helper functions.
 **/
public final class ClockPrxHelper extends Ice.ObjectPrxHelperBase implements ClockPrx
{
    private static final String __getTime_name = "getTime";

    public TimeOfDay getTime()
    {
        return getTime(null, false);
    }

    public TimeOfDay getTime(java.util.Map<String, String> __ctx)
    {
        return getTime(__ctx, true);
    }

    private TimeOfDay getTime(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getTime_name);
        return end_getTime(begin_getTime(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getTime()
    {
        return begin_getTime(null, false, false, null);
    }

    public Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx)
    {
        return begin_getTime(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getTime(Ice.Callback __cb)
    {
        return begin_getTime(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getTime(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getTime(Callback_Clock_getTime __cb)
    {
        return begin_getTime(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx, Callback_Clock_getTime __cb)
    {
        return begin_getTime(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getTime(IceInternal.Functional_GenericCallback1<TimeOfDay> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getTime(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getTime(IceInternal.Functional_GenericCallback1<TimeOfDay> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getTime(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<TimeOfDay> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getTime(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<TimeOfDay> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getTime(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_GenericCallback1<TimeOfDay> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getTime(__ctx, __explicitCtx, __synchronous, 
                             new IceInternal.Functional_TwowayCallbackArg1<demo2.TimeOfDay>(__responseCb, __exceptionCb, __sentCb)
                                 {
                                     public final void __completed(Ice.AsyncResult __result)
                                     {
                                         ClockPrxHelper.__getTime_completed(this, __result);
                                     }
                                 });
    }

    private Ice.AsyncResult begin_getTime(java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getTime_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getTime_name, __cb);
        try
        {
            __result.prepare(__getTime_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public TimeOfDay end_getTime(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getTime_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            TimeOfDay __ret = null;
            __ret = TimeOfDay.__read(__is, __ret);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getTime_completed(Ice.TwowayCallbackArg1<TimeOfDay> __cb, Ice.AsyncResult __result)
    {
        demo2.ClockPrx __proxy = (demo2.ClockPrx)__result.getProxy();
        TimeOfDay __ret = null;
        try
        {
            __ret = __proxy.end_getTime(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __setTime_name = "setTime";

    public void setTime(TimeOfDay time)
    {
        setTime(time, null, false);
    }

    public void setTime(TimeOfDay time, java.util.Map<String, String> __ctx)
    {
        setTime(time, __ctx, true);
    }

    private void setTime(TimeOfDay time, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_setTime(begin_setTime(time, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time)
    {
        return begin_setTime(time, null, false, false, null);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, java.util.Map<String, String> __ctx)
    {
        return begin_setTime(time, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, Ice.Callback __cb)
    {
        return begin_setTime(time, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setTime(time, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, Callback_Clock_setTime __cb)
    {
        return begin_setTime(time, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, java.util.Map<String, String> __ctx, Callback_Clock_setTime __cb)
    {
        return begin_setTime(time, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_setTime(time, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setTime(time, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_setTime(time, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_setTime(TimeOfDay time, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setTime(time, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_setTime(TimeOfDay time, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setTime(time, 
                             __ctx, 
                             __explicitCtx, 
                             __synchronous, 
                             new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_setTime(TimeOfDay time, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__setTime_name, __cb);
        try
        {
            __result.prepare(__setTime_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            TimeOfDay.__write(__os, time);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_setTime(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __setTime_name);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ClockPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ClockPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ClockPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ClockPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static ClockPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, ClockPrx.class, ClockPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static ClockPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, ClockPrx.class, ClockPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::demo2::Clock"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, ClockPrx v)
    {
        __os.writeProxy(v);
    }

    public static ClockPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ClockPrxHelper result = new ClockPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}