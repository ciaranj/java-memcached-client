package net.spy.memcached.ketama;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import net.spy.memcached.MemcachedNode;

/**
 * Provides configuration to the KetamaNodeLocator configuration that allows
 * us to generate compatible server hash keys with the 'Enyim Memcached' client
 * (http://www.codeplex.com/EnyimMemcached/)
 */
public class EnyimKetamaNodeLocatorConfiguration extends DefaultKetamaNodeLocatorConfiguration{

    private static final int NUM_REPS= 100;

    @Override
    public int getNodeRepetitions() {
        return NUM_REPS;
    }



    @Override
    protected String getSocketAddressForNode(MemcachedNode node) {
        String result= socketAddresses.get(node);
        if( result == null ){
            SocketAddress sockAddr= node.getSocketAddress();
            if( sockAddr == null || !(sockAddr instanceof InetSocketAddress )) {
                result= String.valueOf(sockAddr);
            } 
            else {
                InetSocketAddress inetAddress= (InetSocketAddress)sockAddr;
                if( inetAddress.isUnresolved() ) {
                    result= String.valueOf(inetAddress);
                }
                else {
                    result= inetAddress.getAddress().getHostAddress() + ":"+ inetAddress.getPort();
                }
            }
            socketAddresses.put(node, result);
        }
        return result;
    }
}
