import React from 'react';


class Payment extends React.Component
{
    constructor(props)
    {
        super(props);
    }
   
    
    render()
    {
        // var dis = [];
        // // console.log(this.props.view.slots);
        // for (const iterator of this.props.view.slots) {
        //     // console.log(iterator);
        //     for (const iterator1 of iterator.packages) {
        //         dis.push(<p>{iterator.type} - {iterator1.price + " " + 
        //         iterator1.price_unit + " per " + iterator1.charge_unit_count + " " + 
        //         iterator1.charge_unit_unit + " or " + iterator1.time_unit_time + " " + 
        //         iterator1.time_unit_unit} <button class="btn btn-success">Book</button></p>);
            // }
            
        // }
        // console.log(this.props);
        return(
            <div>
                    <h2>Responsive Checkout Form</h2>
                    <p>Resize the browser window to see the effect. When the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other.</p>
                    <div class="row">
                    <div class="col-75">
                        <div class="container">
                        <form action="/action_page.php">
                        
                            <div class="row">
                            <div class="col-50">
                                <h3>Billing Address</h3>
                                <label for="fname"><i class="fa fa-user"></i> Full Name</label>
                                <input type="text" id="fname" name="firstname" placeholder="John M. Doe"/>
                                <label for="email"><i class="fa fa-envelope"></i> Email</label>
                                <input type="text" id="email" name="email" placeholder="john@example.com"/>
                                <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
                                <input type="text" id="adr" name="address" placeholder="542 W. 15th Street"/>
                                <label for="city"><i class="fa fa-institution"></i> City</label>
                                <input type="text" id="city" name="city" placeholder="New York"/>

                                <div class="row">
                                <div class="col-50">
                                    <label for="state">State</label>
                                    <input type="text" id="state" name="state" placeholder="NY"/>
                                </div>
                                <div class="col-50">
                                    <label for="zip">Zip</label>
                                    <input type="text" id="zip" name="zip" placeholder="10001"/>
                                </div>
                                </div>
                            </div>

                            <div class="col-50">
                                <h3>Payment</h3>
                                <label for="fname">Accepted Cards</label>
                                <div class="icon-container">
                                <i class="fa fa-cc-visa" style="color:navy;"></i>
                                <i class="fa fa-cc-amex" style="color:blue;"></i>
                                <i class="fa fa-cc-mastercard" style="color:red;"></i>
                                <i class="fa fa-cc-discover" style="color:orange;"></i>
                                </div>
                                <label for="cname">Name on Card</label>
                                <input type="text" id="cname" name="cardname" placeholder="John More Doe"/>
                                <label for="ccnum">Credit card number</label>
                                <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444"/>
                                <label for="expmonth">Exp Month</label>
                                <input type="text" id="expmonth" name="expmonth" placeholder="September"/>
                                <div class="row">
                                <div class="col-50">
                                    <label for="expyear">Exp Year</label>
                                    <input type="text" id="expyear" name="expyear" placeholder="2018"/>
                                </div>
                                <div class="col-50">
                                    <label for="cvv">CVV</label>
                                    <input type="text" id="cvv" name="cvv" placeholder="352"/>
                                </div>
                                </div>
                            </div>
                            
                            </div>
                            <label>
                            <input type="checkbox" checked="checked" name="sameadr"> Shipping address same as billing</input>
                            </label>
                            <input type="submit" value="Continue to checkout" class="btn"/>
                        </form>
                        </div>
                    </div>
                    <div class="col-25">
                        <div class="container">
                        <h4>Cart <span class="price" style="color:black"><i class="fa fa-shopping-cart"></i> <b>4</b></span></h4>
                        <p><a href="#">Product 1</a> <span class="price">{this.props.b}</span></p>
                        <p><a href="#">Product 2</a> <span class="price"></span></p>
                        <p><a href="#">Product 3</a> <span class="price">$8</span></p>
                        <p><a href="#">Product 4</a> <span class="price">$2</span></p>
                        {/* <hr> */}
                        <p>Total <span class="price" style="color:black"><b>$30</b></span></p>
                        </div>
                    </div>
                    </div>            
            </div>
        );
    }
}
export default Payment;    