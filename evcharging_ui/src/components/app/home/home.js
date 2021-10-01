import React from 'react';
import BookSection from './booksection';
import './home.css'

class Home extends React.Component
{
    constructor(props)
    {
        super(props);
		this.state={
			pincode: 0,
			search_pincode: 0};
    }

	bindPincode = (event) =>{
		this.setState({pincode: event.target.value});
	}

	serahcByPincode = () =>{
		this.setState({search_pincode : this.state.pincode});
	}

    render()
    {
		var dis = [];

		for (const iterator of this.props.d) 
		{
			if(typeof iterator.start_date !== 'undefined')
			{
				if(this.state.search_pincode>0)
				{
					if(this.state.search_pincode==iterator.address.pincode)
					{
						dis.push(<BookSection dealer={iterator} switchMenu={this.props.switchMenu}/>);
					}
				}
				else
				{
					dis.push(<BookSection dealer={iterator} switchMenu={this.props.switchMenu}/>);
				}
			}
			
			
		}
        return(
        <div> 
			<div className="bgimg">
			<h2 align="center"><font size="5">WELCOME</font></h2><hr/>
			<br />
			<div class="row">
		<div class="col">
					<h1>CHARGE IT!</h1>
					<p align="center">We serve the best we can provide!</p>
					<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  						<div class="form-inline" action="/action_page.php">
    						<input class="form-control mr-sm-2" id="myInput" type="text" placeholder="Enter Pincode" onChange={this.bindPincode.bind(this)}></input>
    						<button class="btn btn-success" type="submit" onClick={this.serahcByPincode}>Search Station</button>
  						</div>
					</nav>
					<div>
						<table class="table table-hover">
							<tr>
								<th>Charge Stations</th>
								<th>Charge type</th>
								<th>Station Open till</th>
								<th>Payment Methods</th>
								<th>Pin Codes</th>
								</tr>
						<tbody id="myTable">		
							{dis.map((value) =>{return value})}
							</tbody>
						</table>
					</div>
					{/* <script>
								$(document).ready(function(){
								$("#myInput").on("keyup", function() {
									var value = $(this).val().toLowerCase();
									$("#myTable tr").filter(function() {
									$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
									});
	                                })};
								
									</script> */}
				</div>
		</div>
		</div>
		</div>    
        );
    }
}

export default Home;