package org.tio.core.intf;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 
 * @author tanyaowu 
 * 2017年4月1日 上午9:34:59
 */
public class Packet
{
	//	/**
	//	 * 低优先级
	//	 */
	//	public static final byte PRIORITY_LOW = 1;
	//
	//	/**
	//	 * 高优先级
	//	 */
	//	public static final byte PRIORITY_HIGH = 2;

	//	/**
	//	 * 消息处理的发送的优先级
	//	 */
	//	private byte priority = 1;
	
	private static final AtomicLong ID_ATOMICLONG = new AtomicLong();
	
	private Long id = ID_ATOMICLONG.incrementAndGet();
	
	private Long respId = null;

	/**
	 * 同步发送时，需要的同步序列号
	 */
	private Integer synSeq = 0;

	/**
	 * 预编码过的bytebuffer，如果此值不为null，框架则会忽略原来的encode()过程
	 */
	private ByteBuffer preEncodedByteBuffer = null;
	//
	//	/**
	//	 * @return the priority
	//	 */
	//	public byte getPriority()
	//	{
	//		return priority;
	//	}
	//
	//	/**
	//	 * @param priority the priority to set
	//	 */
	//	public void setPriority(byte priority)
	//	{
	//		this.priority = priority;
	//	}

	/**
	 * @return the synSeq
	 */
	public Integer getSynSeq()
	{
		return synSeq;
	}

	/**
	 * @param synSeq the synSeq to set
	 */
	public void setSynSeq(Integer synSeq)
	{
		this.synSeq = synSeq;
	}

	/**
	 * @return the preEncodedByteBuffer
	 */
	public ByteBuffer getPreEncodedByteBuffer()
	{
		return preEncodedByteBuffer;
	}

	/**
	 * @param preEncodedByteBuffer the preEncodedByteBuffer to set
	 */
	public void setPreEncodedByteBuffer(ByteBuffer preEncodedByteBuffer)
	{
		this.preEncodedByteBuffer = preEncodedByteBuffer;
	}

	public String logstr()
	{
		return "";
	}

	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * @return the respId
	 */
	public Long getRespId()
	{
		return respId;
	}

	/**
	 * @param respId the respId to set
	 */
	public void setRespId(Long respId)
	{
		this.respId = respId;
	}

}
