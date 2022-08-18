class Alpha extends React.Component {
  constructor(props) {
    super(props);
    this.state = { function: "intraday", symbol: "" };
    this.handleChange = this.handleChangeInput.bind(this);
    this.handleChange = this.handleChangeSelect.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChangeInput(event) {
    this.setState({ symbol: event.target.value });
  }

  handleChangeSelect(event) {
    this.setState({ function: event.target.value });
  }

  handleSubmit(event) {
    alert("Your favorite flavor is: " + this.state.value);
    event.preventDefault();
  }

  render() {
    return (
      <div>
        <h1>AlphaVantage Info</h1>
        <form onSubmit={this.handleSubmit}>
          <label for="function">Function:</label>
          <select
            name="function"
            value={this.state.function}
            onChange={this.handleChangeSelect}
          >
            <option value="intraday">Intraday</option>
            <option value="daily">Daily</option>
            <option value="weekly">Weekly</option>
            <option value="monthly">Monthly</option>
          </select>
          <label for="symbol">Symbol:</label>
          <input
            type="text"
            name="symbol"
            placeholder="ej. IBM, MSFT..."
            value={this.state.symbol}
            onChange={this.handleChangeInput}
          ></input>
          <input type="submit" value="Submit" />
        </form>
      </div>
    );
  }
}

ReactDOM.render(<Alpha />, document.getElementById("root"));
