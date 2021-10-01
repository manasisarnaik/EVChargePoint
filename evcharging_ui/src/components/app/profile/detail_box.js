import React from 'react';

class DetailBox extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            // <tr>
            //     <th>{this.props.name}: </th>
            //     <td><input type="text" value={this.props.value} readOnly/></td>
            // </tr>
         <div >
            <h2>Personal details</h2>
        </div>
        );
    }
}
export default DetailBox;