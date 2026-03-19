import React from 'react';
import { motion } from 'motion/react';
import { Home, AlertCircle, Lock, Frown, RefreshCw } from 'lucide-react';
import { Button } from './ui/button';

interface ErrorPageProps {
  type: '400' | '401' | '404' | '500' | 'offline';
}

export default function ErrorPage({ type }: ErrorPageProps) {
  const getErrorContent = () => {
    switch (type) {
      case '400':
        return {
          icon: AlertCircle,
          title: 'Requisição Inválida',
          description: 'Os dados fornecidos estão incorretos ou incompletos.',
          color: 'text-yellow-500',
        };
      case '401':
        return {
          icon: Lock,
          title: 'Acesso Não Autorizado',
          description: 'Você não tem permissão para acessar esta página.',
          color: 'text-red-500',
        };
      case '404':
        return {
          icon: Frown,
          title: 'Página Não Encontrada',
          description: 'Ops! O conteúdo que você procura não existe.',
          color: 'text-blue-500',
        };
      case '500':
        return {
          icon: AlertCircle,
          title: 'Erro no Servidor',
          description: 'Algo deu errado. Nosso time já foi notificado.',
          color: 'text-red-600',
        };
      case 'offline':
        return {
          icon: RefreshCw,
          title: 'Sem Conexão',
          description: 'Verifique sua conexão com a internet.',
          color: 'text-gray-500',
        };
      default:
        return {
          icon: AlertCircle,
          title: 'Erro',
          description: 'Algo deu errado.',
          color: 'text-gray-500',
        };
    }
  };

  const { icon: Icon, title, description, color } = getErrorContent();

  return (
    <div className="min-h-screen bg-[#F9FAFB] flex items-center justify-center px-4">
      <motion.div
        initial={{ opacity: 0, scale: 0.9 }}
        animate={{ opacity: 1, scale: 1 }}
        transition={{ duration: 0.5 }}
        className="text-center max-w-md"
      >
        <motion.div
          initial={{ scale: 0 }}
          animate={{ scale: 1 }}
          transition={{ delay: 0.2, type: 'spring', stiffness: 200 }}
          className={`inline-block p-8 rounded-full bg-white shadow-lg mb-8`}
        >
          <Icon size={80} strokeWidth={1.5} className={color} />
        </motion.div>

        <h1 className="text-4xl text-[#14213D] mb-4">{title}</h1>
        <p className="text-gray-600 mb-8">{description}</p>

        <div className="flex flex-col sm:flex-row gap-4 justify-center">
          <Button
            onClick={() => window.location.href = '/'}
            className="bg-[#FCA311] hover:bg-[#e89300] text-[#14213D]"
          >
            <Home size={18} strokeWidth={1.5} className="mr-2" />
            Voltar à página inicial
          </Button>

          {type === '500' && (
            <Button
              variant="outline"
              onClick={() => window.location.reload()}
            >
              <RefreshCw size={18} strokeWidth={1.5} className="mr-2" />
              Recarregar
            </Button>
          )}

          {type === '500' && (
            <Button
              variant="outline"
              onClick={() => alert('Funcionalidade de relatar erro em desenvolvimento')}
            >
              Relatar erro
            </Button>
          )}

          {type === 'offline' && (
            <Button
              variant="outline"
              onClick={() => window.location.reload()}
            >
              <RefreshCw size={18} strokeWidth={1.5} className="mr-2" />
              Reconectar
            </Button>
          )}
        </div>
      </motion.div>
    </div>
  );
}
