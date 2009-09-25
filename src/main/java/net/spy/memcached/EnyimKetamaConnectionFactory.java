package net.spy.memcached;

import java.util.List;
import net.spy.memcached.ketama.EnyimKetamaNodeLocatorConfiguration;

/**
 * Constructs a connection factory that provides a consistent hashing algorithm
 * compatible with the Enyim memcached client's interpretation of this algorithm
 */
public class EnyimKetamaConnectionFactory extends DefaultConnectionFactory {
	/**
	 * Create a EnyimKetamaConnectionFactory with the given maximum operation
	 * queue length, and the given read buffer size.
	 */
	public EnyimKetamaConnectionFactory(int qLen, int bufSize) {
		super(qLen, bufSize, HashAlgorithm.FNV1A_32_HASH);
	}

	/**
	 * Create a KetamaConnectionFactory with the default parameters.
	 */
	public EnyimKetamaConnectionFactory() {
		this(DEFAULT_OP_QUEUE_LEN, DEFAULT_READ_BUFFER_SIZE);
	}
    
    @Override
    public NodeLocator createLocator(List<MemcachedNode> nodes) {
        return new KetamaNodeLocator(nodes, getHashAlg(), new EnyimKetamaNodeLocatorConfiguration());
    }
}
