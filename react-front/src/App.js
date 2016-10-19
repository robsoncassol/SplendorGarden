import React, { Component } from 'react';
import logo from './logo.svg';
import { Grid, Col, Row, Nav,NavItem  } from 'react-bootstrap';
import Complaint from './components/complaint.js'



class App extends Component {

  constructor(){
    super();
    this.state = {valor:"hummm da hora"}
  }

  handleSelect = function(selectedKey) {
    alert('selected ' + selectedKey);
  }
  render() {
    return (
      <Grid>
        <Row>
          <Col xs={12} md={4} >
            <Nav bsStyle="pills" stacked activeKey={1} onSelect={this.handleSelect}>
              <NavItem eventKey={1} href="/home"> NavItem 1 content</NavItem>
              <NavItem eventKey={2} title="Item">NavItem 2 content</NavItem>
              <NavItem eventKey={3} disabled>NavItem 3 content</NavItem>
            </Nav>
          </Col>
          <Col xs={12} md={4} >
            <Complaint/>
          </Col>
          <Col xs={12} md={4} >
            <img src={logo} className="App-logo" alt="logo" />
          </Col>
        </Row>
      </Grid>
       
    );
  }
}

export default App;
