/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.donut.methods

import com.vk.sdk.api.ApiRequestBase
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.base.dto.BaseUserGroupFields
import com.vk.sdk.api.donut.dto.DonutGetSubscriptionsResponseDto
import com.vk.sdk.api.donut.responses.DonutGetSubscriptionsResponse
import kotlin.Int
import kotlin.collections.List
import org.json.JSONObject

/**
 * Returns a list of user's VK Donut subscriptions.
 * @param fields  
 * @param offset  default 0 minimum 0
 * @param count  default 10 minimum 0 maximum 100
 */
class DonutGetSubscriptions(
    private val fields: List<BaseUserGroupFields>? = null,
    private val offset: Int? = null,
    private val count: Int? = null
) : ApiRequestBase<DonutGetSubscriptionsResponseDto>(methodName = "donut.getSubscriptions") {
    init {
        fields?.let { value ->
            addParam("fields", value)
        }
        offset?.let { value ->
            addParam("offset", value)
        }
        count?.let { value ->
            addParam("count", value)
        }
    }

    override fun parse(r: JSONObject): DonutGetSubscriptionsResponseDto =
            GsonHolder.gson.fromJson(r.toString(),
            DonutGetSubscriptionsResponse::class.java).response
}
