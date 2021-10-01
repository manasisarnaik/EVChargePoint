import React from 'react';
import './booksection.css'

class BookSection extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.dealer);
        this.props.dealer.chargetype = "";
        for (const iterator of this.props.dealer.slots) {
            this.props.dealer.chargetype += iterator.type;
            this.props.dealer.chargetype += "/";  
        }
        return(
            <tr>
			    <td>{this.props.dealer.name}</td>
				<td>{this.props.dealer.chargetype}</td>
				<td>10:00 pm</td>
				<td>Online</td>
                <td>{this.props.dealer.address.pincode}</td>
				<th><button onClick={this.props.switchMenu.bind(this,"book", this.props.dealer)}class="btn btn-success">Book</button></th>
                
			</tr>
        );
    }
}
export default BookSection;