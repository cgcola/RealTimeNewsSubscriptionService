<h1>Real-time News Subscription Service</h1>

<p><strong>Background:</strong> You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.</p>

<p><strong>Scenario Description:</strong> The system comprises two main components: <code>NewsAgency</code> and <code>Subscriber</code>.</p>

<ul>
    <li><strong>NewsAgency:</strong> Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.</li>
    <li><strong>Subscriber:</strong> Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.</li>
</ul>

<h3>Requirements:</h3>
<ol>
    <li><strong>Subscription Management:</strong>
        <ul>
            <li>Users should be able to subscribe to the news service.</li>
            <li>Subscribers should be notified promptly when new news is published.</li>
        </ul>
    </li>
    <li><strong>Dynamic Subscription Updates:</strong>
        <ul>
            <li>The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.</li>
        </ul>
    </li>
    <li><strong>Decoupled Communication:</strong>
        <ul>
            <li>Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.</li>
        </ul>
    </li>
</ol>

<h3>Expected Behavior:</h3>
<ul>
    <li>When the news agency publishes breaking news, all subscribed users should receive immediate updates.</li>
    <li>Subscribers can join or leave the service without affecting the delivery of news to other subscribers.</li>
    <li>The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.</li>
</ul>

<h3>Constraints:</h3>
<ul>
    <li>The system should be scalable to handle a growing number of subscribers without compromising performance.</li>
    <li>Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.</li>
</ul>
