package ch15.exam07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmaple {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();

		queue.offer(new Message("sendMail", "성기문"));
		queue.offer(new Message("sendSMS", "성기문"));
		queue.offer(new Message("sendKakaotalk", "성기문"));

		while (!queue.isEmpty()) {
			Message message = queue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to+" 님에게 메일 보냄");
				break;
			case "sendSMS":
				System.out.println(message.to+" 님에게 문자 보냄");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+" 님에게 카톡 보냄");
				break;
			}

		}
	}

}
