document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/chart/btc-usdt')
        .then(response => response.json())
        .then(data => {
            if (data && Array.isArray(data)) {
                // Convert timestamps to Date objects and extract prices
                const labels = data.map(entry => new Date(entry[0])); // Convert to Date object
                const prices = data.map(entry => parseFloat(entry[4]));

                // Create the chart
                const ctx = document.getElementById('btcUsdtChart').getContext('2d');
                new Chart(ctx, {
                    type: 'line',
                    data: {
                        labels: labels,
                        datasets: [{
                            label: 'BTC/USDT Price',
                            data: prices,
                            borderColor: 'rgba(75, 192, 192, 1)',
                            borderWidth: 1,
                            fill: false
                        }]
                    },
                    options: {
                        scales: {
                            x: {
                                type: 'time',
                                time: {
                                    unit: 'day'
                                }
                            },
                            y: {
                                beginAtZero: false
                            }
                        }
                    }
                });
            } else {
                console.error('Unexpected data format:', data);
            }
        })
        .catch(error => console.error('Error fetching data:', error));
});