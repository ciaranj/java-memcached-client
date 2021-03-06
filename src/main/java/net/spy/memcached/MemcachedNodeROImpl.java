/**
 *
 */
package net.spy.memcached;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Collection;

import net.spy.memcached.ops.Operation;

class MemcachedNodeROImpl implements MemcachedNode {

	private final MemcachedNode root;

	public MemcachedNodeROImpl(MemcachedNode n) {
		super();
		root=n;
	}

	@Override
	public String toString() {
		return root.toString();
	}

	public void addOp(Operation op) {
		throw new UnsupportedOperationException();
	}

	public void connected() {
		throw new UnsupportedOperationException();
	}

	public void copyInputQueue() {
		throw new UnsupportedOperationException();
	}

	public void fillWriteBuffer(boolean optimizeGets) {
		throw new UnsupportedOperationException();
	}

	public void fixupOps() {
		throw new UnsupportedOperationException();
	}

	public int getBytesRemainingToWrite() {
		throw new UnsupportedOperationException();
	}

	public SocketChannel getChannel() {
		throw new UnsupportedOperationException();
	}

	public Operation getCurrentReadOp() {
		throw new UnsupportedOperationException();
	}

	public Operation getCurrentWriteOp() {
		throw new UnsupportedOperationException();
	}

	public ByteBuffer getRbuf() {
		throw new UnsupportedOperationException();
	}

	public int getReconnectCount() {
		throw new UnsupportedOperationException();
	}

	public int getSelectionOps() {
		throw new UnsupportedOperationException();
	}

	public SelectionKey getSk() {
		throw new UnsupportedOperationException();
	}

	public SocketAddress getSocketAddress() {
		return root.getSocketAddress();
	}

	public ByteBuffer getWbuf() {
		throw new UnsupportedOperationException();
	}

	public boolean hasReadOp() {
		throw new UnsupportedOperationException();
	}

	public boolean hasWriteOp() {
		throw new UnsupportedOperationException();
	}

	public boolean isActive() {
		throw new UnsupportedOperationException();
	}

	public void reconnecting() {
		throw new UnsupportedOperationException();
	}

	public void registerChannel(SocketChannel ch, SelectionKey selectionKey) {
		throw new UnsupportedOperationException();
	}

	public Operation removeCurrentReadOp() {
		throw new UnsupportedOperationException();
	}

	public Operation removeCurrentWriteOp() {
		throw new UnsupportedOperationException();
	}

	public void setChannel(SocketChannel to) {
		throw new UnsupportedOperationException();
	}

	public void setSk(SelectionKey to) {
		throw new UnsupportedOperationException();
	}

	public void setupResend() {
		throw new UnsupportedOperationException();
	}

	public void transitionWriteItem() {
		throw new UnsupportedOperationException();
	}

	public int writeSome() throws IOException {
		throw new UnsupportedOperationException();
	}

	public Collection<Operation> destroyInputQueue() {
		throw new UnsupportedOperationException();
	}

}