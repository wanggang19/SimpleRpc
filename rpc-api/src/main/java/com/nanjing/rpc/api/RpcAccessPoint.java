package com.nanjing.rpc.api;

import java.io.Closeable;
import java.net.URI;
import java.util.Collection;

/**
 * @Auther: wanggang
 * @Date: 2021/3/14 14:03
 * @Description: RPC框架对外提供的服务接口
 */
public interface RpcAccessPoint extends Closeable {

    /**
     * 客户端获取远程服务的引用
     * @param uri 远程服务地址
     * @param serviceClass 服务的接口类的Class
     * @param <T> 服务接口的类型
     * @return 远程服务引用
     */
    <T> T getRemoteService(URI uri, Class<T> serviceClass);

    /**
     * 服务端注册服务的实现实例
     * @param service 实现实例
     * @param serviceClass 服务的接口类的Class
     * @param <T> 服务接口的类型
     * @return 服务地址
     */
    <T> URI addServiceProvider(T service, Class<T> serviceClass);

    default NameService getNameService(URI nameServiceUri) {
        Collection<NameService> nameServices = ServiceSu
        return null;
    }
}
