package com.depli.service.store.cache.descriptor;

import com.depli.store.cache.descriptor.MemoryDescriptor;
import org.infinispan.Cache;

/**
 * Memory descriptor cache service
 * <p>
 * Service to retrieve and clear the cache which contains memory usage descriptors.
 *
 * @author lpsandaruwan
 * @since 9/16/17
 */

public interface MemoryDescriptorCacheService {

    /**
     * Returns infinispan cache which uses to store and retrieve memory usage
     * descriptors mapped by the Long values, node IDs related to remote JMX connections
     * which are generated by hibernate.
     *
     * @return memory usage descriptor cache
     */
    public Cache<Long, MemoryDescriptor> getCache();

    /**
     * Clears the cache which contains the map of Long values, node IDs related to
     * remote JMX connections which are generated by hibernate and memory usage
     * descriptors.
     */
    public void clearCache();
}
