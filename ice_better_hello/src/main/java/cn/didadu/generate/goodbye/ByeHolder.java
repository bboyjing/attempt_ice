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
// Generated from file `Goodbye.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.didadu.generate.goodbye;

public final class ByeHolder extends Ice.ObjectHolderBase<Bye>
{
    public
    ByeHolder()
    {
    }

    public
    ByeHolder(Bye value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof Bye)
        {
            value = (Bye)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _ByeDisp.ice_staticId();
    }
}