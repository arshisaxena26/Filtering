<h1> Project-Filtering </h1>

<h2> Overview </h2>
This is a Spring Boot Application that implements Static and Dynamic Filtering.

<h2> What is Filtering? </h2>
Filtering is used to filter fields of model class to form a response packet.<br>
If there are four fields in a model class and only two should be send in response, instead of making a DTO with required two fields and transfering the field data from model to DTO, we can directly use filtering to send only the required fields. <br><br>

<strong>Filtering is of two types: </strong><br>
1. Static Filtering : For data fields that should never form a part of response in any scenario, like password. <br>
2. Dynamic Filtering : For custom requirement of fields in different scenarios.


