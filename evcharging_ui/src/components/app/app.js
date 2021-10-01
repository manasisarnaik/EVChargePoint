import React from 'react';
import Header from './header';
import Body from './body';

class App extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={
            menu: "home",
            view: []
        }
    }

    switchMenu = (menuitem, view_object) =>{
        this.setState({menu: menuitem, view: view_object}, () => {console.log(this.state.menu)});
    }
    

    render()
    {
        return(
            <div>
                <Header switchMenu={this.switchMenu} u={this.props.u} b={this.props.b} d={this.props.d}/>
                <Body menu={this.state.menu} view={this.state.view} u={this.props.u} b={this.props.b} d={this.props.d} switchMenu={this.switchMenu}/>
            </div>
        )
    }
}
export default App;