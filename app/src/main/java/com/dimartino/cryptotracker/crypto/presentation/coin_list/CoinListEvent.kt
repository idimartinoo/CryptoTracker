package com.dimartino.cryptotracker.crypto.presentation.coin_list

import com.dimartino.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}