# ParseSkeletonNotification

Using Parse.com to get notifications. 


##### Usage

Fill up using your Application Id and Key from Parse.com
```java
Parse.initialize(this, "APPLICATION ID", " KEY");
PushService.setDefaultPushCallback(this, MainActivity.class);
```

- Notificaiton Receiver can be customized for JSON you want.
- Try to send json/plain text notifications from Parse website

##### Example

![Getting Notification](https://raw.githubusercontent.com/franzejr/ParseSkeletonNotification/master/Screen%20Shot%202015-02-19%20at%2001.20.03.png "Notification")
