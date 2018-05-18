package com.rains.proxy.net.socket.handler;

import com.rains.proxy.net.protocol.ProtocolDecoderService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * create by lorne on 2017/12/26
 */
@ChannelHandler.Sharable
public class ProtocolDecoderHandler extends MessageToMessageDecoder<byte[]>{


    private ProtocolDecoderService protocolDecoderService;


    public ProtocolDecoderHandler(ProtocolDecoderService protocolDecoderService) {
        this.protocolDecoderService = protocolDecoderService;
    }


    @Override
    protected void decode(ChannelHandlerContext ctx, byte[] msg, List<Object> out) throws Exception {
        protocolDecoderService.decode(ctx, msg, out);

    }
}
