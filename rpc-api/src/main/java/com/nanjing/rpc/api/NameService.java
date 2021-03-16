package com.nanjing.rpc.api;

import java.net.URI;

/**
 * @Auther: wanggang
 * @Date: 2021/3/14 13:46
 * @Description: 注册中心
 */
public interface NameService {

    /**
     * 注册服务
     * @param serviceName
     * @param uri
     */
    void registerService(String serviceName, URI uri);

    /**
     * 查询服务地址
     * @param serviceName
     */
    void lookupService(String serviceName);
}
