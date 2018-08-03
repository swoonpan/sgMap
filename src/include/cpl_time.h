/**********************************************************************
 * $Id: cpl_time.h 34518 2016-07-02 21:01:34Z goatbar $
 *
 * Name:     cpl_time.h
 * Project:  CPL - Common Portability Library
 * Purpose:  Time functions.
 * Author:   Even Rouault, <even dot rouault at mines dash paris dot org>
 *
 **********************************************************************
 * Copyright (c) 2009, Even Rouault <even dot rouault at mines-paris dot org>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 ****************************************************************************/

#ifndef CPL_TIME_H_INCLUDED
#define CPL_TIME_H_INCLUDED

#include <time.h>

#include "cpl_port.h"

struct tm CPL_DLL * CPLUnixTimeToYMDHMS(GIntBig unixTime, struct tm* pRet);
GIntBig CPL_DLL CPLYMDHMSToUnixTime(const struct tm *brokendowntime);

// 2017.8.26 by gskim
GUInt32 CPL_DLL		CPLYMDToUnixTime(const struct tm *brokendowntime);
struct tm CPL_DLL	*CPLUnixTimeToYMD(GUInt32 days, struct tm* pRet);

GUInt32 CPL_DLL		CPLYMDHToUnixTime(const struct tm *brokendowntime);
struct tm CPL_DLL	*CPLUnixTimeToYMDH(GUInt32 unixTime, struct tm* pRet);

GUInt32 CPL_DLL CPLGetMilliSecs();

#endif // CPL_TIME_H_INCLUDED
