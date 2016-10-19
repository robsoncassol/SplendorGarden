import React, { Component } from 'react';
import logo from './logo.svg';
import { Grid, Col, Row } from 'react-bootstrap';


class App extends Component {

  constructor(){
    super();
    this.state = {valor:"hummm da hora"}
  }

  render() {
    return (
      <Grid>
        <Row>
          <Col xs={12} md={4} >
            <h2>{this.state.valor}</h2>
          </Col>
          <Col xs={12} md={4} >
            vamos ver
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
