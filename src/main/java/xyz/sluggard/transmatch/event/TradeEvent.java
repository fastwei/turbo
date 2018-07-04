package xyz.sluggard.transmatch.event;

import lombok.Data;
import xyz.sluggard.transmatch.entity.Trade;

@Data
public class TradeEvent implements Event{
	
	private final Trade trade;

	public TradeEvent(Trade trade) {
		super();
		this.trade = trade;
	}

}
